package com.example.feedskotlin.dao

import com.example.feedskotlin.model.Feeds
import org.springframework.data.repository.CrudRepository

interface FeedsRepository : CrudRepository<Feeds, Long>