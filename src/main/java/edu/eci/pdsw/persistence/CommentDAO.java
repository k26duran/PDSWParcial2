package edu.eci.pdsw.persistence;

import java.util.List;

import edu.eci.pdsw.entities.Comment;

public interface CommentDAO {
	
	public List<Comment> commentByBlogTittle(String title) throws PersistenceException;

	public List<Comment> searchOffensiveLanguageComments() throws PersistenceException;


}
