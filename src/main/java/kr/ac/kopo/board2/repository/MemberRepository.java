package kr.ac.kopo.board2.repository;


import kr.ac.kopo.board2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
