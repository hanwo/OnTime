package com.onTime.project.model.dao;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.onTime.project.model.domain.Memo;

@Repository("memoRepository")
public interface MemoRepository extends ElasticsearchRepository<Memo, String> {
	
	Memo findByUserIdEquals(long userId);
	
	List<Memo> findByNoteContainingAndUserId(String kwd, long userId);

}
