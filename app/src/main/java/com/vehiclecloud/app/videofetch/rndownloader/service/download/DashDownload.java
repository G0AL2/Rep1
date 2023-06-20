package com.vehiclecloud.app.videofetch.rndownloader.service.download;

import android.net.Uri;
import android.util.Log;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTask;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceDelta;
import com.vehiclecloud.app.videofetch.rndownloader.media.DashParser;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Helpers;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.StopRequestException;
import da.p;
import ea.n0;
import ib.d;
import j8.h;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l9.f;
import m9.a;
import m9.c;
import m9.g;
import m9.i;
import m9.j;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes3.dex */
public class DashDownload extends AbstractStreamingDownload {
    private static final long MAX_MERGED_SEGMENT_START_TIME_DIFF_US = 20000000;
    private static final String TAG = "DashDownload";
    private static final String XML_MPD_NAMESPACE = "urn:mpeg:dash:schema:mpd:2011";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Segment implements Comparable<Segment> {
        public final p dataSpec;
        public final long startTimeUs;

        public Segment(long j10, p pVar) {
            this.startTimeUs = j10;
            this.dataSpec = pVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return n0.o(this.startTimeUs, segment.startTimeUs);
        }
    }

    private DashDownload(DownloadWorker downloadWorker, DownloadResourceWithHeaders downloadResourceWithHeaders) {
        super(downloadWorker, downloadResourceWithHeaders);
    }

    private static void addSegment(long j10, String str, i iVar, ArrayList<Segment> arrayList) {
        arrayList.add(new Segment(j10, new p(iVar.b(str), iVar.f34375a, iVar.f34376b, null)));
    }

    protected static void addSegmentsForAdaptationSet(XmlSerializer xmlSerializer, ArrayList<DownloadTask> arrayList, String str, String str2, int i10, a aVar, long j10, long j11) throws IOException {
        String str3;
        a aVar2 = aVar;
        Iterator<j> it = aVar2.f34324c.iterator();
        while (it.hasNext()) {
            j next = it.next();
            f segmentIndex = getSegmentIndex(aVar2.f34323b, next, i10);
            if (segmentIndex != null) {
                long h10 = segmentIndex.h(j11);
                if (h10 == -1) {
                    continue;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<j> it2 = it;
                    String baseUrlOf = DashParser.baseUrlOf(next, null);
                    if (baseUrlOf != null) {
                        i n10 = next.n();
                        if (n10 != null) {
                            addSegment(j10, baseUrlOf, n10, arrayList2);
                        }
                        i m10 = next.m();
                        if (m10 != null) {
                            addSegment(j10, baseUrlOf, m10, arrayList2);
                        }
                        long j12 = segmentIndex.j();
                        long j13 = j12;
                        for (long j14 = (j12 + h10) - 1; j13 <= j14; j14 = j14) {
                            addSegment(j10 + segmentIndex.b(j13), baseUrlOf, segmentIndex.f(j13), arrayList2);
                            j13++;
                        }
                        Collections.sort(arrayList2);
                        mergeSegments(arrayList2);
                        if (!arrayList2.isEmpty()) {
                            xmlSerializer.startTag(null, "Representation");
                            xmlSerializer.attribute(null, "id", next.f34379a.f32698a);
                            xmlSerializer.attribute(null, DownloadWorker.KEY_OUT_MIME_TYPE, next.f34379a.f32708k);
                            xmlSerializer.attribute(null, "codecs", next.f34379a.f32706i);
                            xmlSerializer.attribute(null, "width", String.valueOf(next.f34379a.f32714q));
                            xmlSerializer.attribute(null, "height", String.valueOf(next.f34379a.f32715r));
                            xmlSerializer.startTag(null, "SegmentTemplate");
                            xmlSerializer.attribute(null, "timescale", "1000");
                            int i11 = 1;
                            if (arrayList2.size() > 1) {
                                str3 = MimeTypeMap.getFileExtensionFromUrl(((Segment) arrayList2.get(1)).dataSpec.f29227a.toString());
                                xmlSerializer.attribute(null, "media", str2 + "/$Number$-$RepresentationID$." + str3);
                            } else {
                                str3 = "m4s";
                            }
                            Segment segment = (Segment) arrayList2.get(0);
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(segment.dataSpec.f29227a.toString());
                            xmlSerializer.attribute(null, "initialization", str2 + "/0-$RepresentationID$." + fileExtensionFromUrl);
                            arrayList.add(createSegmentTask(str, segment, str2 + "/0-" + next.f34379a.f32698a + "." + fileExtensionFromUrl));
                            String str4 = "SegmentTimeline";
                            String str5 = null;
                            xmlSerializer.startTag(null, "SegmentTimeline");
                            while (i11 < arrayList2.size()) {
                                Segment segment2 = (Segment) arrayList2.get(i11);
                                xmlSerializer.startTag(str5, "S");
                                String str6 = str4;
                                xmlSerializer.attribute(null, "d", String.valueOf((segment2.startTimeUs - ((Segment) arrayList2.get(i11 - 1)).startTimeUs) / 1000));
                                xmlSerializer.endTag(null, "S");
                                arrayList.add(createSegmentTask(str, segment2, str2 + "/" + i11 + Constants.FILENAME_SEQUENCE_SEPARATOR + next.f34379a.f32698a + "." + str3));
                                i11++;
                                str4 = str6;
                                arrayList2 = arrayList2;
                                str5 = null;
                            }
                            String str7 = str4;
                            String str8 = str5;
                            xmlSerializer.endTag(str8, str7);
                            xmlSerializer.endTag(str8, "SegmentTemplate");
                            xmlSerializer.endTag(str8, "Representation");
                            return;
                        }
                    }
                    aVar2 = aVar;
                    it = it2;
                }
            }
        }
    }

    private static String buildCacheKey(p pVar) {
        String str = pVar.f29234h;
        return str != null ? str : pVar.f29227a.toString();
    }

    private static boolean canMergeSegments(p pVar, p pVar2) {
        if (pVar.f29227a.equals(pVar2.f29227a)) {
            long j10 = pVar.f29233g;
            if (j10 != -1 && pVar.f29232f + j10 == pVar2.f29232f && n0.c(pVar.f29234h, pVar2.f29234h) && pVar.f29235i == pVar2.f29235i && pVar.f29229c == pVar2.f29229c && pVar.f29231e.equals(pVar2.f29231e)) {
                return true;
            }
        }
        return false;
    }

    private static DownloadTask createSegmentTask(String str, Segment segment, String str2) {
        DownloadTask downloadTask = new DownloadTask();
        downloadTask.resourceId = str;
        downloadTask.uri = segment.dataSpec.f29227a.toString();
        downloadTask.fileName = str2;
        downloadTask.status = DownloadResource.STATUS_PENDING;
        return downloadTask;
    }

    public static DashDownload download(DownloadWorker downloadWorker, DownloadResourceWithHeaders downloadResourceWithHeaders) {
        return new DashDownload(downloadWorker, downloadResourceWithHeaders);
    }

    private static f getSegmentIndex(int i10, j jVar, int i11) {
        f l10 = jVar.l();
        if (i10 != 2 || jVar.f34379a.f32714q == i11) {
            return l10;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public XmlSerializer initManifestXml(FileOutputStream fileOutputStream, c cVar) throws IOException {
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(fileOutputStream, d.f31905c.name());
        newSerializer.startDocument(null, Boolean.FALSE);
        newSerializer.startTag(null, "MPD");
        newSerializer.attribute(null, "xmlns", XML_MPD_NAMESPACE);
        newSerializer.attribute(null, "type", "static");
        newSerializer.attribute(null, "minBufferTime", toXsDuration(cVar.f34334c));
        newSerializer.attribute(null, "mediaPresentationDuration", toXsDuration(cVar.f34333b));
        return newSerializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<DownloadTask> initSegmentTasks(c cVar, int i10, String str, String str2, XmlSerializer xmlSerializer) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < cVar.e(); i11++) {
            String str3 = null;
            xmlSerializer.startTag(null, "Period");
            g d10 = cVar.d(i11);
            long a10 = h.a(d10.f34367b);
            long g10 = cVar.g(i11);
            for (a aVar : d10.f34368c) {
                xmlSerializer.startTag(str3, "AdaptationSet");
                xmlSerializer.attribute(str3, "id", String.valueOf(aVar.f34322a));
                addSegmentsForAdaptationSet(xmlSerializer, arrayList, str, str2, i10, aVar, a10, g10);
                xmlSerializer.endTag(null, "AdaptationSet");
                str3 = null;
            }
            xmlSerializer.endTag(str3, "Period");
        }
        return arrayList;
    }

    private static void mergeSegments(List<Segment> list) {
        HashMap hashMap = new HashMap();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Segment segment = list.get(i11);
            String buildCacheKey = buildCacheKey(segment.dataSpec);
            Integer num = (Integer) hashMap.get(buildCacheKey);
            Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 != null && segment.startTimeUs <= segment2.startTimeUs + MAX_MERGED_SEGMENT_START_TIME_DIFF_US && canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                long j10 = segment.dataSpec.f29233g;
                list.set(((Integer) ea.a.e(num)).intValue(), new Segment(segment2.startTimeUs, segment2.dataSpec.f(0L, j10 != -1 ? segment2.dataSpec.f29233g + j10 : -1L)));
            } else {
                hashMap.put(buildCacheKey, Integer.valueOf(i10));
                list.set(i10, segment);
                i10++;
            }
        }
        n0.N0(list, i10, list.size());
    }

    private String toXsDuration(long j10) {
        return "PT" + (j10 / 1000.0d) + "S";
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.service.download.AbstractStreamingDownload
    protected void fetchPlayList() {
        new DownloadConnection(null, this.resource.uri, this.headers, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.service.download.DashDownload.1
            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onException(StopRequestException stopRequestException) throws StopRequestException {
                Log.e(DashDownload.TAG, "fetchPlayList get ex:", stopRequestException);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onFinished() {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.b(this);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onMovedPerm(String str) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.c(this, str);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onOk(HttpURLConnection httpURLConnection) {
                if (Helpers.parseHeader(httpURLConnection, DashDownload.this.resource)) {
                    DashDownload dashDownload = DashDownload.this;
                    dashDownload.resource.totalBytes = 0L;
                    dashDownload.updateResource();
                }
                try {
                    c a10 = DashParser.parser.a(Uri.parse(DashDownload.this.resource.uri), httpURLConnection.getInputStream());
                    String createAndGetBaseDir = DashDownload.this.createAndGetBaseDir();
                    FileOutputStream fileOutputStream = new FileOutputStream(DashDownload.this.resource.fileName);
                    XmlSerializer initManifestXml = DashDownload.this.initManifestXml(fileOutputStream, a10);
                    DownloadResourceDelta downloadResourceDelta = DashDownload.this.resource;
                    List<DownloadTask> initSegmentTasks = DashDownload.initSegmentTasks(a10, downloadResourceDelta.width, downloadResourceDelta.f28600id, createAndGetBaseDir, initManifestXml);
                    initManifestXml.endTag(null, "MPD");
                    initManifestXml.endDocument();
                    fileOutputStream.flush();
                    Helpers.closeQuietly(fileOutputStream);
                    DashDownload.this.worker.mDownloadResourceDao.saveAllTasks(initSegmentTasks);
                    DashDownload dashDownload2 = DashDownload.this;
                    dashDownload2.segmentTasks = dashDownload2.worker.mDownloadResourceDao.getAllTasksByResId(dashDownload2.resource.f28600id);
                    DashDownload.this.startTasks();
                } catch (IOException e10) {
                    Log.e(DashDownload.TAG, "fetchPlayList get ex", e10);
                    DashDownload dashDownload3 = DashDownload.this;
                    DownloadResourceDelta downloadResourceDelta2 = dashDownload3.resource;
                    int i10 = downloadResourceDelta2.numFailed + 1;
                    downloadResourceDelta2.numFailed = i10;
                    if (i10 < 5) {
                        downloadResourceDelta2.status = DownloadResource.STATUS_WAITING_TO_RETRY;
                    } else {
                        downloadResourceDelta2.status = DownloadResource.STATUS_CANNOT_RESUME;
                    }
                    dashDownload3.updateResource();
                }
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onPartial(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.e(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onStart(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.f(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onUnavailable(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.g(this, httpURLConnection);
            }
        });
    }
}
