package com.codegym.blog.model.repository;

import com.codegym.blog.model.bean.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findAllByNameBlog(String name);

}
