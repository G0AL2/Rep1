package c9;

import j8.p1;

/* compiled from: MetadataDecoderFactory.java */
/* loaded from: classes2.dex */
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5331a = new a();

    /* compiled from: MetadataDecoderFactory.java */
    /* loaded from: classes2.dex */
    class a implements c {
        a() {
        }

        @Override // c9.c
        public boolean a(p1 p1Var) {
            String str = p1Var.f32709l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // c9.c
        public b b(p1 p1Var) {
            String str = p1Var.f32709l;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new d9.a();
                    case 1:
                        return new f9.a();
                    case 2:
                        return new com.google.android.exoplayer2.metadata.id3.a();
                    case 3:
                        return new e9.a();
                    case 4:
                        return new com.google.android.exoplayer2.metadata.scte35.a();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(p1 p1Var);

    b b(p1 p1Var);
}
