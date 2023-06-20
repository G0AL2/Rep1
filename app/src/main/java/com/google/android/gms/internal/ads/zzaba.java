package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaba {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzaaw zza(String str) throws IOException {
        long j10;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (zzeh.zzc(newPullParser, "x:xmpmeta")) {
                zzfrj zzo = zzfrj.zzo();
                long j11 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (zzeh.zzc(newPullParser, "rdf:Description")) {
                        String[] strArr = zza;
                        int i10 = 0;
                        for (int i11 = 0; i11 < 4; i11++) {
                            String zza2 = zzeh.zza(newPullParser, strArr[i11]);
                            if (zza2 != null) {
                                if (Integer.parseInt(zza2) != 1) {
                                    return null;
                                } else {
                                    String[] strArr2 = zzb;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 >= 4) {
                                            break;
                                        }
                                        String zza3 = zzeh.zza(newPullParser, strArr2[i12]);
                                        if (zza3 != null) {
                                            j10 = Long.parseLong(zza3);
                                            if (j10 == -1) {
                                            }
                                        } else {
                                            i12++;
                                        }
                                    }
                                    j10 = -9223372036854775807L;
                                    String[] strArr3 = zzc;
                                    while (true) {
                                        if (i10 < 2) {
                                            String zza4 = zzeh.zza(newPullParser, strArr3[i10]);
                                            if (zza4 != null) {
                                                zzo = zzfrj.zzq(new zzaav("image/jpeg", "Primary", 0L, 0L), new zzaav("video/mp4", "MotionPhoto", Long.parseLong(zza4), 0L));
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            zzo = zzfrj.zzo();
                                            break;
                                        }
                                    }
                                    j11 = j10;
                                }
                            }
                        }
                        return null;
                    } else if (zzeh.zzc(newPullParser, "Container:Directory")) {
                        zzo = zzb(newPullParser, "Container", "Item");
                    } else if (zzeh.zzc(newPullParser, "GContainer:Directory")) {
                        zzo = zzb(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!zzeh.zzb(newPullParser, "x:xmpmeta"));
                if (zzo.isEmpty()) {
                    return null;
                }
                return new zzaaw(j11, zzo);
            }
            throw zzbp.zza("Couldn't find xmp metadata", null);
        } catch (zzbp | NumberFormatException | XmlPullParserException unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfrj zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        zzfrg zzi = zzfrj.zzi();
        do {
            xmlPullParser.next();
            if (zzeh.zzc(xmlPullParser, concat)) {
                String zza2 = zzeh.zza(xmlPullParser, str2.concat(":Mime"));
                String zza3 = zzeh.zza(xmlPullParser, str2.concat(":Semantic"));
                String zza4 = zzeh.zza(xmlPullParser, str2.concat(":Length"));
                String zza5 = zzeh.zza(xmlPullParser, str2.concat(":Padding"));
                if (zza2 != null && zza3 != null) {
                    zzi.zze(new zzaav(zza2, zza3, zza4 != null ? Long.parseLong(zza4) : 0L, zza5 != null ? Long.parseLong(zza5) : 0L));
                } else {
                    return zzfrj.zzo();
                }
            }
        } while (!zzeh.zzb(xmlPullParser, concat2));
        return zzi.zzg();
    }
}
