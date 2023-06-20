package w8;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import ea.a0;
import j8.p1;
import p8.t;

/* compiled from: MetadataUtil.java */
/* loaded from: classes2.dex */
final class h {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f38403a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static CommentFrame a(int i10, a0 a0Var) {
        int n10 = a0Var.n();
        if (a0Var.n() == 1684108385) {
            a0Var.Q(8);
            String y10 = a0Var.y(n10 - 16);
            return new CommentFrame("und", y10, y10);
        }
        String valueOf = String.valueOf(a.a(i10));
        ea.r.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    private static ApicFrame b(a0 a0Var) {
        int n10 = a0Var.n();
        if (a0Var.n() == 1684108385) {
            int b10 = a.b(a0Var.n());
            String str = b10 == 13 ? "image/jpeg" : b10 == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Unrecognized cover art flags: ");
                sb2.append(b10);
                ea.r.h("MetadataUtil", sb2.toString());
                return null;
            }
            a0Var.Q(4);
            int i10 = n10 - 16;
            byte[] bArr = new byte[i10];
            a0Var.j(bArr, 0, i10);
            return new ApicFrame(str, null, 3, bArr);
        }
        ea.r.h("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static Metadata.Entry c(a0 a0Var) {
        int e10 = a0Var.e() + a0Var.n();
        int n10 = a0Var.n();
        int i10 = (n10 >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & n10;
                if (i11 == 6516084) {
                    return a(n10, a0Var);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return h(n10, "TIT2", a0Var);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return h(n10, "TCOM", a0Var);
                }
                if (i11 == 6578553) {
                    return h(n10, "TDRC", a0Var);
                }
                if (i11 == 4280916) {
                    return h(n10, "TPE1", a0Var);
                }
                if (i11 == 7630703) {
                    return h(n10, "TSSE", a0Var);
                }
                if (i11 == 6384738) {
                    return h(n10, "TALB", a0Var);
                }
                if (i11 == 7108978) {
                    return h(n10, "USLT", a0Var);
                }
                if (i11 == 6776174) {
                    return h(n10, "TCON", a0Var);
                }
                if (i11 == 6779504) {
                    return h(n10, "TIT1", a0Var);
                }
            } else if (n10 == 1735291493) {
                return g(a0Var);
            } else {
                if (n10 == 1684632427) {
                    return d(n10, "TPOS", a0Var);
                }
                if (n10 == 1953655662) {
                    return d(n10, "TRCK", a0Var);
                }
                if (n10 == 1953329263) {
                    return i(n10, "TBPM", a0Var, true, false);
                }
                if (n10 == 1668311404) {
                    return i(n10, "TCMP", a0Var, true, true);
                }
                if (n10 == 1668249202) {
                    return b(a0Var);
                }
                if (n10 == 1631670868) {
                    return h(n10, "TPE2", a0Var);
                }
                if (n10 == 1936682605) {
                    return h(n10, "TSOT", a0Var);
                }
                if (n10 == 1936679276) {
                    return h(n10, "TSO2", a0Var);
                }
                if (n10 == 1936679282) {
                    return h(n10, "TSOA", a0Var);
                }
                if (n10 == 1936679265) {
                    return h(n10, "TSOP", a0Var);
                }
                if (n10 == 1936679791) {
                    return h(n10, "TSOC", a0Var);
                }
                if (n10 == 1920233063) {
                    return i(n10, "ITUNESADVISORY", a0Var, false, false);
                }
                if (n10 == 1885823344) {
                    return i(n10, "ITUNESGAPLESS", a0Var, false, true);
                }
                if (n10 == 1936683886) {
                    return h(n10, "TVSHOWSORT", a0Var);
                }
                if (n10 == 1953919848) {
                    return h(n10, "TVSHOW", a0Var);
                }
                if (n10 == 757935405) {
                    return e(a0Var, e10);
                }
            }
            String valueOf = String.valueOf(a.a(n10));
            ea.r.b("MetadataUtil", valueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            a0Var.P(e10);
        }
    }

    private static TextInformationFrame d(int i10, String str, a0 a0Var) {
        int n10 = a0Var.n();
        if (a0Var.n() == 1684108385 && n10 >= 22) {
            a0Var.Q(10);
            int J = a0Var.J();
            if (J > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(J);
                String sb3 = sb2.toString();
                int J2 = a0Var.J();
                if (J2 > 0) {
                    String valueOf = String.valueOf(sb3);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 12);
                    sb4.append(valueOf);
                    sb4.append("/");
                    sb4.append(J2);
                    sb3 = sb4.toString();
                }
                return new TextInformationFrame(str, null, sb3);
            }
        }
        String valueOf2 = String.valueOf(a.a(i10));
        ea.r.h("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static Id3Frame e(a0 a0Var, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (a0Var.e() < i10) {
            int e10 = a0Var.e();
            int n10 = a0Var.n();
            int n11 = a0Var.n();
            a0Var.Q(4);
            if (n11 == 1835360622) {
                str = a0Var.y(n10 - 12);
            } else if (n11 == 1851878757) {
                str2 = a0Var.y(n10 - 12);
            } else {
                if (n11 == 1684108385) {
                    i11 = e10;
                    i12 = n10;
                }
                a0Var.Q(n10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        a0Var.P(i11);
        a0Var.Q(16);
        return new InternalFrame(str, str2, a0Var.y(i12 - 16));
    }

    public static MdtaMetadataEntry f(a0 a0Var, int i10, String str) {
        while (true) {
            int e10 = a0Var.e();
            if (e10 >= i10) {
                return null;
            }
            int n10 = a0Var.n();
            if (a0Var.n() == 1684108385) {
                int n11 = a0Var.n();
                int n12 = a0Var.n();
                int i11 = n10 - 16;
                byte[] bArr = new byte[i11];
                a0Var.j(bArr, 0, i11);
                return new MdtaMetadataEntry(str, bArr, n12, n11);
            }
            a0Var.P(e10 + n10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.metadata.id3.TextInformationFrame g(ea.a0 r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = w8.h.f38403a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            ea.r.h(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.h.g(ea.a0):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    private static TextInformationFrame h(int i10, String str, a0 a0Var) {
        int n10 = a0Var.n();
        if (a0Var.n() == 1684108385) {
            a0Var.Q(8);
            return new TextInformationFrame(str, null, a0Var.y(n10 - 16));
        }
        String valueOf = String.valueOf(a.a(i10));
        ea.r.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static Id3Frame i(int i10, String str, a0 a0Var, boolean z10, boolean z11) {
        int j10 = j(a0Var);
        if (z11) {
            j10 = Math.min(1, j10);
        }
        if (j10 >= 0) {
            if (z10) {
                return new TextInformationFrame(str, null, Integer.toString(j10));
            }
            return new CommentFrame("und", str, Integer.toString(j10));
        }
        String valueOf = String.valueOf(a.a(i10));
        ea.r.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int j(a0 a0Var) {
        a0Var.Q(4);
        if (a0Var.n() == 1684108385) {
            a0Var.Q(8);
            return a0Var.D();
        }
        ea.r.h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, t tVar, p1.b bVar) {
        if (i10 == 1 && tVar.a()) {
            bVar.N(tVar.f35694a).O(tVar.f35695b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r6 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(int r5, com.google.android.exoplayer2.metadata.Metadata r6, com.google.android.exoplayer2.metadata.Metadata r7, j8.p1.b r8, com.google.android.exoplayer2.metadata.Metadata... r9) {
        /*
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r1 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = 0
        L14:
            int r6 = r7.g()
            if (r5 >= r6) goto L3c
            com.google.android.exoplayer2.metadata.Metadata$Entry r6 = r7.f(r5)
            boolean r3 = r6 instanceof com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r6 = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) r6
            java.lang.String r3 = r6.f21218a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.Metadata r5 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r7 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            com.google.android.exoplayer2.metadata.Metadata r6 = r6.e(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.g()
            if (r5 <= 0) goto L52
            r8.X(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.h.l(int, com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.metadata.Metadata, j8.p1$b, com.google.android.exoplayer2.metadata.Metadata[]):void");
    }
}
