package com.blogproject.comments;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.impl.blog.util.SessionUtil;

public class CommentRepository {

	public String createComment(Comment comment) {
		Session session = SessionUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
					
			session.save(comment);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in createComment Repository::: "+ e);
			transaction.rollback();
		} finally {
			session.close();
		}
		return comment.getId()+"";
	}
}
