package com.member.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.member.Main.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String>{

}
