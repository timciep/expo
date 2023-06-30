'use strict';

function appendAssetPrefix(
  path: string,
  assetPrefix: string | undefined = process.env._EXPO_METRO_ASSET_PREFIX
) {
  if (assetPrefix) {
    return `/${assetPrefix.replace(/^\/+/, '').replace(/\/$/, '')}${path}`;
  }
  return path;
}

module.exports = function assetPrefixAssetPlugin(asset: any) {
  asset.httpServerLocation = appendAssetPrefix(asset.httpServerLocation);
  asset.doesStuff = true;
  console.log('asset >', process.env._EXPO_METRO_ASSET_PREFIX, asset);
  return asset;
};
