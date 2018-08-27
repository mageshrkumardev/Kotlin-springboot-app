package com.example.feedskotlin.service

import com.example.feedskotlin.dao.FeedsRepository
import com.example.feedskotlin.model.Feeds
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
internal class FeedsServiceImpl(val feedsRepository: FeedsRepository) : FeedsService {

    override fun list(): List<Feeds> {
        return feedsRepository.findAll().toList()
    }

    override fun getFeedById(id: Long): Feeds {
        return feedsRepository.findById(id).get()
    }

    override fun saveFeeds(feed: Feeds): Feeds {
        return  feedsRepository.save(feed)
    }

    override fun deleteById(id: Long) {
        return feedsRepository.deleteById(id)
    }

    override fun updateFeed(id: Long, feed: Feeds): Feeds {

        val optional = feedsRepository.findById(id)

        if(optional.isPresent) return feedsRepository.save(feed)
        else  return optional.get()
    }
}