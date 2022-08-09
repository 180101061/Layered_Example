package com.zee.zee5app.service;

import java.util.List;
import java.util.Optional;

import com.zee.zee5app.dto.User;
import com.zee.zee5app.exceptions.InvalidIdException;
import com.zee.zee5app.exceptions.NoDataFoundException;
import com.zee.zee5app.exceptions.UnableToGenerateIdException;

public interface UserService {

	public User insertuser(User user) throws UnableToGenerateIdException;
	public String updateUser(String UserId,User user) throws InvalidIdException;
	public String deleteUser(String userId) throws NoDataFoundException;
	public Optional<List<User>> getAllUser();
	public Optional<User> getUserByUserId (String UserId);
}
