package com.bricolage.main;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, BigInteger> {
    
}
