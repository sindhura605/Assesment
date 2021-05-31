package com.test.www.pojos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Posts {
	public List<Post> posts;
}
