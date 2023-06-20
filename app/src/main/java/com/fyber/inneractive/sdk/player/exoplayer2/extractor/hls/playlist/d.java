package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Queue;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d implements y.a<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f18343a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f18344b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f18345c = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f18346d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f18347e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f18348f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f18349g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f18350h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f18351i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f18352j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f18353k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f18354l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f18355m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f18356n = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f18357o = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f18358p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f18359q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f18360r = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f18361s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f18362t = a("AUTOSELECT");

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f18363u = a("DEFAULT");

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f18364v = a("FORCED");

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final BufferedReader f18365a;

        /* renamed from: b  reason: collision with root package name */
        public final Queue<String> f18366b;

        /* renamed from: c  reason: collision with root package name */
        public String f18367c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.f18366b = queue;
            this.f18365a = bufferedReader;
        }

        public boolean a() throws IOException {
            String trim;
            if (this.f18367c != null) {
                return true;
            }
            if (!this.f18366b.isEmpty()) {
                this.f18367c = this.f18366b.poll();
                return true;
            }
            do {
                String readLine = this.f18365a.readLine();
                this.f18367c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f18367c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() throws IOException {
            if (a()) {
                String str = this.f18367c;
                this.f18367c = null;
                return str;
            }
            return null;
        }
    }

    public static b b(a aVar, String str) throws IOException {
        int i10;
        String hexString;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 2;
        char c10 = 0;
        int i12 = 1;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        boolean z11 = false;
        b.a aVar2 = null;
        int i18 = 0;
        long j16 = -1;
        boolean z12 = false;
        while (true) {
            String str2 = null;
            String str3 = null;
            while (aVar.a()) {
                String b10 = aVar.b();
                if (b10.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String b11 = b(b10, f18349g);
                    if ("VOD".equals(b11)) {
                        i13 = 1;
                    } else if ("EVENT".equals(b11)) {
                        i13 = 2;
                    }
                } else if (b10.startsWith("#EXT-X-START")) {
                    j10 = (long) (Double.parseDouble(b(b10, f18352j)) * 1000000.0d);
                } else if (b10.startsWith("#EXT-X-MAP")) {
                    String b12 = b(b10, f18356n);
                    String a10 = a(b10, f18354l);
                    if (a10 != null) {
                        String[] split = a10.split("@");
                        j16 = Long.parseLong(split[c10]);
                        if (split.length > i12) {
                            j13 = Long.parseLong(split[i12]);
                        }
                    }
                    aVar2 = new b.a(b12, 0L, -1, -9223372036854775807L, false, null, null, j13, j16);
                    j13 = 0;
                    j16 = -1;
                } else if (b10.startsWith("#EXT-X-TARGETDURATION")) {
                    j11 = 1000000 * Integer.parseInt(b(b10, f18347e));
                } else if (b10.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    i18 = Integer.parseInt(b(b10, f18350h));
                    i16 = i18;
                } else if (b10.startsWith("#EXT-X-VERSION")) {
                    i17 = Integer.parseInt(b(b10, f18348f));
                } else if (b10.startsWith("#EXTINF")) {
                    j15 = (long) (Double.parseDouble(b(b10, f18351i)) * 1000000.0d);
                } else if (b10.startsWith("#EXT-X-KEY")) {
                    z12 = "AES-128".equals(b(b10, f18355m));
                    if (z12) {
                        str3 = b(b10, f18356n);
                        str2 = a(b10, f18357o);
                    }
                } else if (b10.startsWith("#EXT-X-BYTERANGE")) {
                    String[] split2 = b(b10, f18353k).split("@");
                    j16 = Long.parseLong(split2[c10]);
                    if (split2.length > i12) {
                        j13 = Long.parseLong(split2[i12]);
                    }
                } else if (b10.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                    i15 = Integer.parseInt(b10.substring(b10.indexOf(58) + i12));
                    z10 = true;
                } else if (b10.equals("#EXT-X-DISCONTINUITY")) {
                    i14++;
                } else if (b10.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                    if (j12 == 0) {
                        String substring = b10.substring(b10.indexOf(58) + i12);
                        Matcher matcher = u.f19611f.matcher(substring);
                        if (matcher.matches()) {
                            if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                i10 = 0;
                            } else {
                                i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                if (matcher.group(11).equals(Constants.FILENAME_SEQUENCE_SEPARATOR)) {
                                    i10 *= -1;
                                }
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                            gregorianCalendar.clear();
                            gregorianCalendar.set(Integer.parseInt(matcher.group(i12)), Integer.parseInt(matcher.group(i11)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                            if (!TextUtils.isEmpty(matcher.group(8))) {
                                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                            }
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (i10 != 0) {
                                timeInMillis -= i10 * 60000;
                            }
                            j12 = com.fyber.inneractive.sdk.player.exoplayer2.b.a(timeInMillis) - j14;
                        } else {
                            throw new l("Invalid date/time format: " + substring);
                        }
                    }
                } else if (b10.startsWith("#EXT-X-DATERANGE")) {
                    arrayList2.add(b10);
                } else if (!b10.startsWith("#")) {
                    if (z12) {
                        hexString = str2 != null ? str2 : Integer.toHexString(i18);
                    } else {
                        hexString = null;
                    }
                    int i19 = i18 + 1;
                    int i20 = (j16 > (-1L) ? 1 : (j16 == (-1L) ? 0 : -1));
                    if (i20 == 0) {
                        j13 = 0;
                    }
                    arrayList.add(new b.a(b10, j15, i14, j14, z12, str3, hexString, j13, j16));
                    j14 += j15;
                    if (i20 != 0) {
                        j13 += j16;
                    }
                    i18 = i19;
                    j16 = -1;
                    j15 = 0;
                } else if (b10.equals("#EXT-X-ENDLIST")) {
                    i11 = 2;
                    c10 = 0;
                    i12 = 1;
                    z11 = true;
                }
                i11 = 2;
                c10 = 0;
                i12 = 1;
            }
            return new b(i13, str, j10, j12, z10, i15, i16, i17, j11, z11, j12 != 0, aVar2, arrayList, arrayList2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        r1 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r1 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        r1 = r1.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r1.isEmpty() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        if (r1.startsWith("#EXT-X-STREAM-INF") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        r9.add(r1);
        r8 = a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(r9, r0), r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
        if (r1.startsWith("#EXT-X-TARGETDURATION") != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
        if (r1.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
        if (r1.startsWith("#EXTINF") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
        if (r1.startsWith("#EXT-X-KEY") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
        if (r1.startsWith("#EXT-X-BYTERANGE") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r1.equals("#EXT-X-DISCONTINUITY") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
        if (r1.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d0, code lost:
        if (r1.equals("#EXT-X-ENDLIST") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d3, code lost:
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
        r9.add(r1);
        r8 = b(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(r9, r0), r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ea, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00eb, code lost:
        com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f5, code lost:
        throw new com.fyber.inneractive.sdk.player.exoplayer2.l("Failed to parse the playlist, could not identify any tags.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(android.net.Uri r8, java.io.InputStream r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (r14.equals("CLOSED-CAPTIONS") == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a r45, java.lang.String r46) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d$a, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a");
    }

    public static String b(String str, Pattern pattern) throws l {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new l("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static boolean a(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z10;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }
}
