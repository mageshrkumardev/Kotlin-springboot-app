package com.example.feedskotlin.service

import com.example.feedskotlin.model.Feeds

interface FeedsService {

    fun list(): List<Feeds>

    fun saveFeeds(feed: Feeds) : Feeds

    fun getFeedById(id: Long) : Feeds

    fun deleteById(id: Long)

    fun updateFeed(id: Long, feed: Feeds): Feeds
}