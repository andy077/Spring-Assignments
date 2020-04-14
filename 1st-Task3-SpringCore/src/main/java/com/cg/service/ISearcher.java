package com.cg.service;

import java.util.List;

public interface ISearcher {

	boolean search(String str);
	List<String> searchStartWith(String str);
	List<String> displayAll();
}