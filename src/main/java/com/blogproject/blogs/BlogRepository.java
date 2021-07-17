package com.blogproject.blogs;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.impl.blog.util.SessionUtil;

public class BlogRepository {

	public String createBlog(Blog blog) {
		Session session = SessionUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
					
			session.save(blog);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in createBlog Repository::: "+ e);
		} finally {
			session.close();
		}
		return "";
	}
}
