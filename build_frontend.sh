echo "build doris manager frontend start"
cd frontend
npm config set legacy-peer-deps true
npm install
npm run build
echo "build doris manager frontend end"