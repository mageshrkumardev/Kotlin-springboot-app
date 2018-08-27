package com.example.feedskotlin.controller

import com.example.feedskotlin.model.Feeds
import com.example.feedskotlin.service.FeedsService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/api/feeds")
class FeedsController(private  val feedsService: FeedsService) {

    @GetMapping("/list")
    fun getAllFeeds() =
         feedsService.list()

    @PostMapping("/save-feeds")
    fun saveFeeds(@Valid @RequestBody feeds: Feeds) = feedsService.saveFeeds(feeds)

    @GetMapping("/{id}")
    fun getFeedsById(@PathVariable(value = "id") id: Long) = feedsService.getFeedById(id)

    @DeleteMapping( "/delete/{id}")
    fun deleteById(@PathVariable(value = "id") id: Long) = feedsService.deleteById(id)

    @PutMapping("/update-feed/{id}")
    fun updateFeeds(@PathVariable(value="id") id : Long, @Valid @RequestBody feed: Feeds) = feedsService.updateFeed(id,feed)

}