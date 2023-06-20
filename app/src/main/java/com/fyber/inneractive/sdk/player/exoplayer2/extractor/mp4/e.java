package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.IronSourceSegment;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f18621a = u.a("nam");

    /* renamed from: b  reason: collision with root package name */
    public static final int f18622b = u.a("trk");

    /* renamed from: c  reason: collision with root package name */
    public static final int f18623c = u.a("cmt");

    /* renamed from: d  reason: collision with root package name */
    public static final int f18624d = u.a("day");

    /* renamed from: e  reason: collision with root package name */
    public static final int f18625e = u.a("ART");

    /* renamed from: f  reason: collision with root package name */
    public static final int f18626f = u.a("too");

    /* renamed from: g  reason: collision with root package name */
    public static final int f18627g = u.a("alb");

    /* renamed from: h  reason: collision with root package name */
    public static final int f18628h = u.a("com");

    /* renamed from: i  reason: collision with root package name */
    public static final int f18629i = u.a("wrt");

    /* renamed from: j  reason: collision with root package name */
    public static final int f18630j = u.a("lyr");

    /* renamed from: k  reason: collision with root package name */
    public static final int f18631k = u.a(IronSourceSegment.GENDER);

    /* renamed from: l  reason: collision with root package name */
    public static final int f18632l = u.a("covr");

    /* renamed from: m  reason: collision with root package name */
    public static final int f18633m = u.a("gnre");

    /* renamed from: n  reason: collision with root package name */
    public static final int f18634n = u.a("grp");

    /* renamed from: o  reason: collision with root package name */
    public static final int f18635o = u.a("disk");

    /* renamed from: p  reason: collision with root package name */
    public static final int f18636p = u.a("trkn");

    /* renamed from: q  reason: collision with root package name */
    public static final int f18637q = u.a("tmpo");

    /* renamed from: r  reason: collision with root package name */
    public static final int f18638r = u.a("cpil");

    /* renamed from: s  reason: collision with root package name */
    public static final int f18639s = u.a("aART");

    /* renamed from: t  reason: collision with root package name */
    public static final int f18640t = u.a("sonm");

    /* renamed from: u  reason: collision with root package name */
    public static final int f18641u = u.a("soal");

    /* renamed from: v  reason: collision with root package name */
    public static final int f18642v = u.a("soar");

    /* renamed from: w  reason: collision with root package name */
    public static final int f18643w = u.a("soaa");

    /* renamed from: x  reason: collision with root package name */
    public static final int f18644x = u.a("soco");

    /* renamed from: y  reason: collision with root package name */
    public static final int f18645y = u.a("rtng");

    /* renamed from: z  reason: collision with root package name */
    public static final int f18646z = u.a("pgap");
    public static final int A = u.a("sosn");
    public static final int B = u.a("tvsh");
    public static final int C = u.a("----");
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int i13 = kVar.f19580b;
            if (i13 >= i10) {
                break;
            }
            int c10 = kVar.c();
            int c11 = kVar.c();
            kVar.f(4);
            if (c11 == a.D0) {
                str = kVar.a(c10 - 12);
            } else if (c11 == a.E0) {
                str2 = kVar.a(c10 - 12);
            } else {
                if (c11 == a.F0) {
                    i11 = i13;
                    i12 = c10;
                }
                kVar.f(c10 - 12);
            }
        }
        if ("com.apple.iTunes".equals(str) && "iTunSMPB".equals(str2) && i11 != -1) {
            kVar.e(i11);
            kVar.f(16);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e("und", str2, kVar.a(i12 - 16));
        }
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j b(int i10, String str, com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int c10 = kVar.c();
        if (kVar.c() == a.F0) {
            kVar.f(8);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j(str, null, kVar.a(c10 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    public static int b(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        kVar.f(4);
        if (kVar.c() == a.F0) {
            kVar.f(8);
            return kVar.l();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int c10 = kVar.c();
        if (kVar.c() == a.F0) {
            kVar.f(8);
            String a10 = kVar.a(c10 - 16);
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e("und", a10, a10);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h a(int i10, String str, com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, boolean z10, boolean z11) {
        int b10 = b(kVar);
        if (z11) {
            b10 = Math.min(1, b10);
        }
        if (b10 >= 0) {
            if (z10) {
                return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j(str, null, Integer.toString(b10));
            }
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e("und", str, Integer.toString(b10));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j a(int i10, String str, com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int c10 = kVar.c();
        if (kVar.c() == a.F0 && c10 >= 22) {
            kVar.f(10);
            int q10 = kVar.q();
            if (q10 > 0) {
                String str2 = "" + q10;
                int q11 = kVar.q();
                if (q11 > 0) {
                    str2 = str2 + "/" + q11;
                }
                return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j(str, null, str2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar) {
        int c10 = kVar.c();
        if (kVar.c() == a.F0) {
            int c11 = kVar.c() & 16777215;
            String str = c11 == 13 ? "image/jpeg" : c11 == 14 ? "image/png" : null;
            if (str == null) {
                Log.w("MetadataUtil", "Unrecognized cover art flags: " + c11);
                return null;
            }
            kVar.f(4);
            int i10 = c10 - 16;
            byte[] bArr = new byte[i10];
            System.arraycopy(kVar.f19579a, kVar.f19580b, bArr, 0, i10);
            kVar.f19580b += i10;
            return new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }
}
