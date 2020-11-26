package com.byeongukchoi.springdatarestexample.event;

import com.byeongukchoi.springdatarestexample.domain.Post;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.util.logging.Logger;

@RepositoryEventHandler
public class PostRepositoryEventHandler {
        Logger logger = Logger.getLogger("Class PostRepositoryEventHandler");

        @HandleBeforeCreate
        public void handlePostBeforeCreate(Post post) {
            logger.info("Inside Post Before Class");
        }
}
