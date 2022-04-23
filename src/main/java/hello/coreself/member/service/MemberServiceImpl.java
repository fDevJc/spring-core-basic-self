package hello.coreself.member.service;

import hello.coreself.member.Member;
import hello.coreself.member.repository.MemberRepository;

public class MemberServiceImpl implements MemberService{

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    private final MemberRepository memberRepository;

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long id) {
        return memberRepository.findById(id);
    }
}
