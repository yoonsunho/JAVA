package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store =new HashMap<>();
    private static  long sequence = 0L;

    @Override
    public Member save(Member member) { // 새로운 회원을 저장
        member.setId(++sequence);
        store.put(member.getId(), member);
        return  member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id)); // Optional 로 감싸면 null 값 반환해도 ㄱㅊ
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();// 하나라도 찾기
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }
}
