package gf;

/* compiled from: ErrorCode.kt */
/* loaded from: classes3.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    /* JADX INFO: Fake field, exist only in values array */
    SETTINGS_TIMEOUT(4),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_CLOSED(5),
    /* JADX INFO: Fake field, exist only in values array */
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    /* JADX INFO: Fake field, exist only in values array */
    COMPRESSION_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_ERROR(10),
    /* JADX INFO: Fake field, exist only in values array */
    ENHANCE_YOUR_CALM(11),
    /* JADX INFO: Fake field, exist only in values array */
    INADEQUATE_SECURITY(12),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: i  reason: collision with root package name */
    public static final a f30873i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f30874a;

    /* compiled from: ErrorCode.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final b a(int i10) {
            b[] values;
            for (b bVar : b.values()) {
                if (bVar.f() == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    b(int i10) {
        this.f30874a = i10;
    }

    public final int f() {
        return this.f30874a;
    }
}
