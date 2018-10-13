package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.pdsw.entities.Comment;

public interface CommentMapper {
	
	public List<Comment> commentByBlogTitle(@Param("title")String title);

	public List<Comment> searchOffensiveLanguageComments();

	
}
