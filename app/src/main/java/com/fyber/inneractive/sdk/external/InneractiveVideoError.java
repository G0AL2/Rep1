package com.fyber.inneractive.sdk.external;

/* loaded from: classes.dex */
public class InneractiveVideoError extends InneractiveError {

    /* renamed from: a  reason: collision with root package name */
    public final Error f17172a;

    /* renamed from: b  reason: collision with root package name */
    public Throwable f17173b;

    /* loaded from: classes.dex */
    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);
        

        /* renamed from: a  reason: collision with root package name */
        public String f17175a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17176b;

        Error(String str, boolean z10) {
            this.f17175a = str;
            this.f17176b = z10;
        }

        public String getErrorString() {
            return this.f17175a;
        }

        public boolean isFatal() {
            return this.f17176b;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f17172a = error;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        if (this.f17173b != null) {
            return this.f17172a.getErrorString() + ": " + this.f17173b;
        }
        return this.f17172a.getErrorString();
    }

    public Throwable getCause() {
        return this.f17173b;
    }

    public Error getPlayerError() {
        return this.f17172a;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.f17173b = th;
    }
}
