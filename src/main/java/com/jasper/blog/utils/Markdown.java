package com.jasper.blog.utils;


import com.jasper.blog.support.web.MarkdownService;
import com.jasper.blog.support.web.PegDownMarkdownService;

public class Markdown {

    private static final MarkdownService MARKDOWN_SERVICE = new PegDownMarkdownService();

    public static String markdownToHtml(String content){
        return MARKDOWN_SERVICE.renderToHtml(content);
    }
}
