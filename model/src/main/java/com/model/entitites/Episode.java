package com.model.entitites;

/**
 * Created by saulmm on 27/01/15.
 */
public class Episode {

    private String id;
    private String url;
    private String name;
    private String season;
    private String number;
    private String airdate;
    private String airtime;
    private String airstamp;
    private String runtime;
    private EpisodeImage image;

    public String getId() {

        return id;
    }

    public String getUrl() {

        return url;
    }

    public String getName() {

        return name;
    }

    public String getSeason() {

        return season;
    }

    public String getNumber() {

        return number;
    }

    public String getAirdate() {

        return airdate;
    }

    public String getAirtime() {

        return airtime;
    }

    public String getAirstamp() {

        return airstamp;
    }

    public String getRuntime() {

        return runtime;
    }

    public EpisodeImage getImage() {

        return image;
    }

    class EpisodeImage {

        private String medium;
        private String original;

        public String getMedium() {

            return medium;
        }

        public String getOriginal() {

            return original;
        }
    }
}
