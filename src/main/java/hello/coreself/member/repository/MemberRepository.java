package hello.coreself.member.repository;

import hello.coreself.member.Member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long id);
}
