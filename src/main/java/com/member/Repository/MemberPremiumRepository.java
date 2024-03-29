package com.member.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.member.Main.MemberPremium;

@Repository
public interface MemberPremiumRepository extends JpaRepository<MemberPremium, String> {

}
