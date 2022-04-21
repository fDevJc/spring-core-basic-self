package hello.coreself.member.service;

import hello.coreself.member.Member;

public interface MemberService {

    void join(Member member);
    Member findMember(Long id);

}
