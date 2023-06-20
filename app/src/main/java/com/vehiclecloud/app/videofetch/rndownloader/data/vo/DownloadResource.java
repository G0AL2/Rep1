package com.vehiclecloud.app.videofetch.rndownloader.data.vo;

/* loaded from: classes3.dex */
public class DownloadResource extends DownloadTaskBase {
    public static final int MIN_ARTIFICIAL_ERROR_STATUS = 488;
    public static final int STATUS_BAD_REQUEST = 400;
    public static final int STATUS_CANCELED = 490;
    public static final int STATUS_CANNOT_RESUME = 489;
    public static final int STATUS_DEVICE_NOT_FOUND_ERROR = 199;
    public static final int STATUS_FILE_ALREADY_EXISTS_ERROR = 488;
    public static final int STATUS_FILE_ERROR = 492;
    public static final int STATUS_HTTP_DATA_ERROR = 495;
    public static final int STATUS_HTTP_EXCEPTION = 496;
    public static final int STATUS_INSUFFICIENT_SPACE_ERROR = 198;
    public static final int STATUS_LENGTH_REQUIRED = 411;
    public static final int STATUS_NOT_ACCEPTABLE = 406;
    public static final int STATUS_PAUSED_BY_APP = 193;
    public static final int STATUS_PENDING = 190;
    public static final int STATUS_PRECONDITION_FAILED = 412;
    public static final int STATUS_QUEUED_FOR_WIFI = 196;
    public static final int STATUS_RUNNING = 192;
    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_TOO_MANY_REDIRECTS = 497;
    public static final int STATUS_UNHANDLED_HTTP_CODE = 494;
    public static final int STATUS_UNHANDLED_REDIRECT = 493;
    public static final int STATUS_UNKNOWN_ERROR = 491;
    public static final int STATUS_WAITING_FOR_NETWORK = 195;
    public static final int STATUS_WAITING_TO_RETRY = 194;
    public static final String TYPE_VIDEO = "video";
    public int allowedNetworkTypes;
    public Author author;
    public long createdOn;
    public int duration;
    public String fileExt;
    public String folder;
    public int height;
    public String hotSharePath;

    /* renamed from: id  reason: collision with root package name */
    public String f28597id;
    public long latestOpenedOn;
    public String mergedFileName;
    public int parentalGuide;
    public Poster poster;
    public String referer;
    public String remark;
    public int syncToGallery;
    public String tags;
    public String title;
    public String trigger;
    public String type;
    public String userAgent;
    public int width;
    public String workerId;

    /* loaded from: classes3.dex */
    public static class Author {
        public String avatar;

        /* renamed from: id  reason: collision with root package name */
        public String f28598id;
        public String name;
    }

    /* loaded from: classes3.dex */
    public static class Poster {
        public int height;
        public String src;
        public int width;
    }

    /* loaded from: classes3.dex */
    public interface SyncToGalleryStatus {
        public static final int DONE = 2;
        public static final int NO_NEED = -1;
        public static final int WAITING = 1;
    }
}
