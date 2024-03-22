package study.spring_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.spring_jpa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}