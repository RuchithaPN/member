package com.member.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.member.Main.MemberPolicy;

@Repository

public interface MemberPolicyRepository extends JpaRepository<MemberPolicy, String> {

}
