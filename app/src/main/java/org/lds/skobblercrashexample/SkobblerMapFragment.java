package org.lds.skobblercrashexample;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skobbler.ngx.SKCoordinate;
import com.skobbler.ngx.SKMaps;
import com.skobbler.ngx.map.SKAnnotation;
import com.skobbler.ngx.map.SKCoordinateRegion;
import com.skobbler.ngx.map.SKMapCustomPOI;
import com.skobbler.ngx.map.SKMapInternationalizationSettings;
import com.skobbler.ngx.map.SKMapPOI;
import com.skobbler.ngx.map.SKMapSurfaceListener;
import com.skobbler.ngx.map.SKMapSurfaceView;
import com.skobbler.ngx.map.SKMapViewHolder;
import com.skobbler.ngx.map.SKPOICluster;
import com.skobbler.ngx.map.SKScreenPoint;

import java.util.Locale;

public class SkobblerMapFragment extends Fragment implements SKMapSurfaceListener {

    SKMapViewHolder mapViewHolder;
    private SKMapSurfaceView mapSurfaceView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_skobbler_map, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mapViewHolder = (SKMapViewHolder) getActivity().findViewById(R.id.skobbler_map_view_holder);
    }

    @Override
    public void onResume() {
        super.onResume();

        mapViewHolder.setMapSurfaceListener(this);
        mapViewHolder.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapViewHolder.setMapSurfaceListener(new EmptySkobblerMapSurfaceListener());

        mapViewHolder.onPause();
    }

    public static SkobblerMapFragment newInstance() {
        return new SkobblerMapFragment();
    }

    private void setMapInternationalizationSettings() {
        SKMapInternationalizationSettings settings = new SKMapInternationalizationSettings();
        settings.setPrimaryLanguage(localeToSkLanguage(Locale.getDefault()));
        settings.setFallbackLanguage(SKMaps.SKLanguage.LANGUAGE_EN);
        mapSurfaceView.getMapSettings().setMapInternationalizationSettings(settings);
    }

    public SKMaps.SKLanguage localeToSkLanguage(Locale locale) { // NOSONAR simple
        try {
            String localeString = locale.toString().toLowerCase();

            if (localeString.startsWith("de")) {
                return SKMaps.SKLanguage.LANGUAGE_DE;
            } else if (localeString.startsWith("es")) {
                return SKMaps.SKLanguage.LANGUAGE_ES;
            } else if (localeString.startsWith("fr")) {
                return SKMaps.SKLanguage.LANGUAGE_FR;
            } else if (localeString.startsWith("it")) {
                return SKMaps.SKLanguage.LANGUAGE_IT;
            } else {
                return SKMaps.SKLanguage.LANGUAGE_EN;
            }
        } catch (IllegalArgumentException e) {
            return SKMaps.SKLanguage.LANGUAGE_EN;
        }
    }

    //Skobbler stuff

    @Override
    public void onSurfaceCreated(SKMapViewHolder skMapViewHolder) {
        mapSurfaceView = skMapViewHolder.getMapSurfaceView();

        setMapInternationalizationSettings();


        //This is so we are at the correct place
        mapSurfaceView.animateToLocation(new SKCoordinate(52.5200, 13.4050), 0);
        mapSurfaceView.setZoom(7);
    }

    @Override
    public void onActionPan() {

    }

    @Override
    public void onActionZoom() {

    }

    @Override
    public void onMapRegionChanged(SKCoordinateRegion skCoordinateRegion) {

    }

    @Override
    public void onMapRegionChangeStarted(SKCoordinateRegion skCoordinateRegion) {

    }

    @Override
    public void onMapRegionChangeEnded(SKCoordinateRegion skCoordinateRegion) {

    }

    @Override
    public void onDoubleTap(SKScreenPoint skScreenPoint) {

    }

    @Override
    public void onSingleTap(SKScreenPoint skScreenPoint) {

    }

    @Override
    public void onRotateMap() {

    }

    @Override
    public void onLongPress(SKScreenPoint skScreenPoint) {

    }

    @Override
    public void onInternetConnectionNeeded() {

    }

    @Override
    public void onMapActionDown(SKScreenPoint skScreenPoint) {

    }

    @Override
    public void onMapActionUp(SKScreenPoint skScreenPoint) {

    }

    @Override
    public void onPOIClusterSelected(SKPOICluster skpoiCluster) {

    }

    @Override
    public void onMapPOISelected(SKMapPOI skMapPOI) {

    }

    @Override
    public void onAnnotationSelected(SKAnnotation skAnnotation) {

    }

    @Override
    public void onCustomPOISelected(SKMapCustomPOI skMapCustomPOI) {

    }

    @Override
    public void onCompassSelected() {

    }

    @Override
    public void onCurrentPositionSelected() {

    }

    @Override
    public void onObjectSelected(int i) {

    }

    @Override
    public void onInternationalisationCalled(int i) {

    }

    @Override
    public void onDebugInfo(double v, float v1, double v2) {

    }

    @Override
    public void onBoundingBoxImageRendered(int i) {

    }

    @Override
    public void onGLInitializationError(String s) {

    }

    @Override
    public void onScreenshotReady(Bitmap bitmap) {

    }
}
