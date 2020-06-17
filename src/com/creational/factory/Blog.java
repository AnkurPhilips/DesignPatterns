package com.creational.factory;

public class Blog extends Website {
    @Override
    protected void createPage() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
