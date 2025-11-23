import { useTranslation } from 'react-i18next';
import './App.css';

function App() {
  const { t } = useTranslation();

  console.log('backend base url', import.meta.env.VITE_API_URL);

  return (
    <>
      <div>{t('welcome_message')}</div>
    </>
  );
}

export default App;
