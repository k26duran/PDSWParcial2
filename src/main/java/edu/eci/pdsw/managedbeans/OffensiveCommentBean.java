/*
 * Copyright (C) 2016 salzate
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.entities.User;
import edu.eci.pdsw.services.BlogServices;
import edu.eci.pdsw.services.ServicesException;

/**
 *
 * @author salzate
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "offensiveCommentBean")
@RequestScoped

public class OffensiveCommentBean extends BasePageBean {


	
	private static final long serialVersionUID = 35940091612527828L;
	
	@Inject
	private BlogServices blogServices;

    public List<Comment> getComments() throws Exception{
        try {
            return blogServices.searchOffensiveLanguageComments();
        } catch (ServicesException ex) {
            
            throw ex;
        }
        
    }

    
}
