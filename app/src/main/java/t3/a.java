package t3;

/* compiled from: CacheErrorLogger.java */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: CacheErrorLogger.java */
    /* renamed from: t3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0503a {
        READ_DECODE,
        READ_FILE,
        READ_FILE_NOT_FOUND,
        READ_INVALID_ENTRY,
        WRITE_ENCODE,
        WRITE_CREATE_TEMPFILE,
        WRITE_UPDATE_FILE_NOT_FOUND,
        WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND,
        WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND,
        WRITE_RENAME_FILE_OTHER,
        WRITE_CREATE_DIR,
        WRITE_CALLBACK_ERROR,
        WRITE_INVALID_ENTRY,
        DELETE_FILE,
        EVICTION,
        GENERIC_IO,
        OTHER
    }

    void a(EnumC0503a enumC0503a, Class<?> cls, String str, Throwable th);
}
