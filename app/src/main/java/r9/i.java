package r9;

import j8.p1;

/* compiled from: SubtitleDecoderFactory.java */
/* loaded from: classes2.dex */
public interface i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f36526a = new a();

    /* compiled from: SubtitleDecoderFactory.java */
    /* loaded from: classes2.dex */
    class a implements i {
        a() {
        }

        @Override // r9.i
        public boolean a(p1 p1Var) {
            String str = p1Var.f32709l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // r9.i
        public g b(p1 p1Var) {
            String str = p1Var.f32709l;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1201784583:
                        if (str.equals("text/x-exoplayer-cues")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new t9.a(p1Var.f32711n);
                    case 1:
                        return new u9.a();
                    case 2:
                        return new aa.a();
                    case 3:
                        return new aa.h();
                    case 4:
                        return new z9.a(p1Var.f32711n);
                    case 5:
                        return new w9.a(p1Var.f32711n);
                    case 6:
                    case '\b':
                        return new s9.a(str, p1Var.D, 16000L);
                    case 7:
                        return new d();
                    case '\t':
                        return new s9.c(p1Var.D, p1Var.f32711n);
                    case '\n':
                        return new x9.a();
                    case 11:
                        return new y9.c();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(p1 p1Var);

    g b(p1 p1Var);
}
