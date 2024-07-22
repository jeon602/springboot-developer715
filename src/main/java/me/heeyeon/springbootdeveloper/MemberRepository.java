package me.heeyeon.springbootdeveloper;

import me.heeyeon.springbootdeveloper.study.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}