package com.demo.security.util;

import com.demo.security.model.RepoName;
import com.demo.security.model.RepoNamesList;

public class QueryUtil {
    private QueryUtil() {
    }

    public static StringBuilder getRepositoryListForQuery(RepoNamesList repoNamesList, String orgUserName) {
        StringBuilder repoNamesString = new StringBuilder();
        for (RepoName r :
                repoNamesList.getRepoNames()) {
            repoNamesString.append("repo:").append(orgUserName).append("/").append(r.getName()).append(" ");
        }
        if (repoNamesList.getRepoNames().isEmpty()) {
            repoNamesString.append("org:").append(orgUserName);
        }
        return repoNamesString;
    }
}
