package study.spring_jpa.repository;

import study.spring_jpa.entity.Member;

import java.util.List;

public interface MemberRepositoryCunstom {
    List<Member> findMemberCustom();
}
