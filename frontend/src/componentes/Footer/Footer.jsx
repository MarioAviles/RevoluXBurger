/*
Contendra el pie de pagina de la hamburgueseria
 y los enlaces a las redes sociales.
*/

const Footer = () => {
    return (
        <footer>
            <div className="footer-content">
                <p>&copy; 2023 MUESTRAMELO. Todos los derechos reservados.</p>
                <div className="social-media">
                    <a href="https://www.facebook.com" target="_blank" rel="noopener noreferrer">Facebook</a>
                    <a href="https://www.twitter.com" target="_blank" rel="noopener noreferrer">Twitter</a>
                    <a href="https://www.instagram.com" target="_blank" rel="noopener noreferrer">Instagram</a>
                </div>
            </div>
        </footer>
    );
}
export default Footer;