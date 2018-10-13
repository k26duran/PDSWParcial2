package edu.eci.pdsw.persistence.mybatisimpl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.persistence.CommentDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.CommentMapper;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.UserMapper;

public class MyBatisCommentDAO implements CommentDAO {
	
	@Inject
	CommentMapper commentMapper;
	
	
	@Override
	public List<Comment> commentByBlogTittle(String title) {
		return commentMapper.commentByBlogTitle(title);
	}


	@Override
	public List<Comment> searchOffensiveLanguageComments() throws PersistenceException {
		try {
			return commentMapper.searchOffensiveLanguageComments();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new UnsupportedOperationException("Not supported yet.");
		}
	
	}

	
	


}
