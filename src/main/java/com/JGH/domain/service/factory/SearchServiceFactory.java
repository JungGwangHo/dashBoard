package com.JGH.domain.service.factory;

import com.JGH.domain.service.PostSearchService;

public interface SearchServiceFactory {

	PostSearchService getSearchService(String selector);
}
