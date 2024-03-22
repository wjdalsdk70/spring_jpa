package study.spring_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.spring_jpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsername(String username);
}