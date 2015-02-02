package com.eseo.tvshowtracker.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Damien on 2/2/2015.
 */
public class ResultsPage implements Serializable{

    public Integer page;
    public List<TvSeries> results;
    public Integer total_pages;
    public Integer total_results;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<TvSeries> getResults() {
        return results;
    }

    public void setResults(List<TvSeries> results) {
        this.results = results;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }

    public Integer getTotal_results() {
        return total_results;
    }

    public void setTotal_results(Integer total_results) {
        this.total_results = total_results;
    }
}
