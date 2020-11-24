--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

-- Started on 2020-11-24 17:02:45

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 200 (class 1259 OID 16395)
-- Name: categorias; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.categorias (
    id integer NOT NULL,
    denominacion character varying(60) NOT NULL,
    descripcion character varying(80)
);


ALTER TABLE public.categorias OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 16398)
-- Name: categorias_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.categorias_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.categorias_id_seq OWNER TO postgres;

--
-- TOC entry 3060 (class 0 OID 0)
-- Dependencies: 201
-- Name: categorias_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.categorias_id_seq OWNED BY public.categorias.id;


--
-- TOC entry 202 (class 1259 OID 16400)
-- Name: clientes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clientes (
    id integer NOT NULL,
    documento character varying(10) NOT NULL,
    nombre character varying(60) NOT NULL,
    apellido character varying(60) NOT NULL,
    tipo_cliente_id integer
);


ALTER TABLE public.clientes OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 16403)
-- Name: clientes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.clientes_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.clientes_id_seq OWNER TO postgres;

--
-- TOC entry 3061 (class 0 OID 0)
-- Dependencies: 203
-- Name: clientes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.clientes_id_seq OWNED BY public.clientes.id;


--
-- TOC entry 204 (class 1259 OID 16405)
-- Name: detalle_factura; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.detalle_factura (
    id integer NOT NULL,
    cantidad integer NOT NULL,
    monto double precision NOT NULL,
    productos_id integer,
    facturas_id integer
);


ALTER TABLE public.detalle_factura OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 16408)
-- Name: detalle_factura_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.detalle_factura_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.detalle_factura_id_seq OWNER TO postgres;

--
-- TOC entry 3062 (class 0 OID 0)
-- Dependencies: 205
-- Name: detalle_factura_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.detalle_factura_id_seq OWNED BY public.detalle_factura.id;


--
-- TOC entry 206 (class 1259 OID 16410)
-- Name: facturas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.facturas (
    id integer NOT NULL,
    numero_factura integer NOT NULL,
    monto_total double precision NOT NULL,
    fecha_facturacion date,
    observaciones character varying(200),
    clientes_id integer,
    forma_pago_id integer,
    detalle_factura_id integer
);


ALTER TABLE public.facturas OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 16413)
-- Name: facturas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.facturas_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.facturas_id_seq OWNER TO postgres;

--
-- TOC entry 3063 (class 0 OID 0)
-- Dependencies: 207
-- Name: facturas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.facturas_id_seq OWNED BY public.facturas.id;


--
-- TOC entry 208 (class 1259 OID 16415)
-- Name: forma_pago; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.forma_pago (
    id integer NOT NULL,
    denominacion character varying(20)
);


ALTER TABLE public.forma_pago OWNER TO postgres;

--
-- TOC entry 209 (class 1259 OID 16418)
-- Name: forma_pago_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.forma_pago_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.forma_pago_id_seq OWNER TO postgres;

--
-- TOC entry 3064 (class 0 OID 0)
-- Dependencies: 209
-- Name: forma_pago_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.forma_pago_id_seq OWNED BY public.forma_pago.id;


--
-- TOC entry 210 (class 1259 OID 16420)
-- Name: productos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.productos (
    id integer NOT NULL,
    nombre character varying(60),
    descripcion character varying(80),
    precio double precision,
    categorias_id integer
);


ALTER TABLE public.productos OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 16423)
-- Name: productos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.productos_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.productos_id_seq OWNER TO postgres;

--
-- TOC entry 3065 (class 0 OID 0)
-- Dependencies: 211
-- Name: productos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.productos_id_seq OWNED BY public.productos.id;


--
-- TOC entry 212 (class 1259 OID 16425)
-- Name: tipo_cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tipo_cliente (
    id integer NOT NULL,
    nombre character varying(60),
    descripcion character varying(80)
);


ALTER TABLE public.tipo_cliente OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 16428)
-- Name: tipo_cliente_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.tipo_cliente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tipo_cliente_id_seq OWNER TO postgres;

--
-- TOC entry 3066 (class 0 OID 0)
-- Dependencies: 213
-- Name: tipo_cliente_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.tipo_cliente_id_seq OWNED BY public.tipo_cliente.id;


--
-- TOC entry 2886 (class 2604 OID 16430)
-- Name: categorias id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categorias ALTER COLUMN id SET DEFAULT nextval('public.categorias_id_seq'::regclass);


--
-- TOC entry 2887 (class 2604 OID 16431)
-- Name: clientes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes ALTER COLUMN id SET DEFAULT nextval('public.clientes_id_seq'::regclass);


--
-- TOC entry 2888 (class 2604 OID 16432)
-- Name: detalle_factura id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_factura ALTER COLUMN id SET DEFAULT nextval('public.detalle_factura_id_seq'::regclass);


--
-- TOC entry 2889 (class 2604 OID 16433)
-- Name: facturas id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.facturas ALTER COLUMN id SET DEFAULT nextval('public.facturas_id_seq'::regclass);


--
-- TOC entry 2890 (class 2604 OID 16434)
-- Name: forma_pago id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.forma_pago ALTER COLUMN id SET DEFAULT nextval('public.forma_pago_id_seq'::regclass);


--
-- TOC entry 2891 (class 2604 OID 16435)
-- Name: productos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos ALTER COLUMN id SET DEFAULT nextval('public.productos_id_seq'::regclass);


--
-- TOC entry 2892 (class 2604 OID 16436)
-- Name: tipo_cliente id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_cliente ALTER COLUMN id SET DEFAULT nextval('public.tipo_cliente_id_seq'::regclass);


--
-- TOC entry 3041 (class 0 OID 16395)
-- Dependencies: 200
-- Data for Name: categorias; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.categorias (id, denominacion, descripcion) VALUES (1, 'golosinas', 'Sin descripcion');
INSERT INTO public.categorias (id, denominacion, descripcion) VALUES (7, 'harinas', 'Sin descripcion');
INSERT INTO public.categorias (id, denominacion, descripcion) VALUES (13, 'golosinas', 'abcdasd');
INSERT INTO public.categorias (id, denominacion, descripcion) VALUES (14, 'Bebidas', 'Gaseosas');
INSERT INTO public.categorias (id, denominacion, descripcion) VALUES (15, 'Bebidas', 'Alcoholicas');


--
-- TOC entry 3043 (class 0 OID 16400)
-- Dependencies: 202
-- Data for Name: clientes; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.clientes (id, documento, nombre, apellido, tipo_cliente_id) VALUES (2, '39654321', 'Pedro', 'Luna', NULL);
INSERT INTO public.clientes (id, documento, nombre, apellido, tipo_cliente_id) VALUES (1, '40123456', 'Marcos', 'Gutierrez ', NULL);
INSERT INTO public.clientes (id, documento, nombre, apellido, tipo_cliente_id) VALUES (5, '28022598', 'Juan', 'Navarro', 2);


--
-- TOC entry 3045 (class 0 OID 16405)
-- Dependencies: 204
-- Data for Name: detalle_factura; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3047 (class 0 OID 16410)
-- Dependencies: 206
-- Data for Name: facturas; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3049 (class 0 OID 16415)
-- Dependencies: 208
-- Data for Name: forma_pago; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3051 (class 0 OID 16420)
-- Dependencies: 210
-- Data for Name: productos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.productos (id, nombre, descripcion, precio, categorias_id) VALUES (1, 'Gaseosa', 'Sin descripcion', 40, NULL);
INSERT INTO public.productos (id, nombre, descripcion, precio, categorias_id) VALUES (3, 'Agua saborizada', 'x 2LT', 39, NULL);


--
-- TOC entry 3053 (class 0 OID 16425)
-- Dependencies: 212
-- Data for Name: tipo_cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.tipo_cliente (id, nombre, descripcion) VALUES (1, 'Consumindor Final', '');
INSERT INTO public.tipo_cliente (id, nombre, descripcion) VALUES (2, 'Responsable Inscripto', '');


--
-- TOC entry 3067 (class 0 OID 0)
-- Dependencies: 201
-- Name: categorias_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.categorias_id_seq', 15, true);


--
-- TOC entry 3068 (class 0 OID 0)
-- Dependencies: 203
-- Name: clientes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.clientes_id_seq', 5, true);


--
-- TOC entry 3069 (class 0 OID 0)
-- Dependencies: 205
-- Name: detalle_factura_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.detalle_factura_id_seq', 1, false);


--
-- TOC entry 3070 (class 0 OID 0)
-- Dependencies: 207
-- Name: facturas_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.facturas_id_seq', 1, false);


--
-- TOC entry 3071 (class 0 OID 0)
-- Dependencies: 209
-- Name: forma_pago_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.forma_pago_id_seq', 1, false);


--
-- TOC entry 3072 (class 0 OID 0)
-- Dependencies: 211
-- Name: productos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.productos_id_seq', 3, true);


--
-- TOC entry 3073 (class 0 OID 0)
-- Dependencies: 213
-- Name: tipo_cliente_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tipo_cliente_id_seq', 2, true);


--
-- TOC entry 2894 (class 2606 OID 16438)
-- Name: categorias categorias_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categorias
    ADD CONSTRAINT categorias_pkey PRIMARY KEY (id);


--
-- TOC entry 2896 (class 2606 OID 16440)
-- Name: clientes clientes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pkey PRIMARY KEY (id);


--
-- TOC entry 2898 (class 2606 OID 16442)
-- Name: detalle_factura detalle_factura_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_factura
    ADD CONSTRAINT detalle_factura_pkey PRIMARY KEY (id);


--
-- TOC entry 2900 (class 2606 OID 16444)
-- Name: facturas facturas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.facturas
    ADD CONSTRAINT facturas_pkey PRIMARY KEY (id);


--
-- TOC entry 2902 (class 2606 OID 16446)
-- Name: forma_pago forma_pago_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.forma_pago
    ADD CONSTRAINT forma_pago_pkey PRIMARY KEY (id);


--
-- TOC entry 2904 (class 2606 OID 16448)
-- Name: productos productos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos
    ADD CONSTRAINT productos_pkey PRIMARY KEY (id);


--
-- TOC entry 2906 (class 2606 OID 16450)
-- Name: tipo_cliente tipo_cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_cliente
    ADD CONSTRAINT tipo_cliente_pkey PRIMARY KEY (id);


--
-- TOC entry 2910 (class 2606 OID 16451)
-- Name: productos fk_categoria; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.productos
    ADD CONSTRAINT fk_categoria FOREIGN KEY (categorias_id) REFERENCES public.categorias(id);


--
-- TOC entry 2908 (class 2606 OID 16456)
-- Name: detalle_factura fk_facturas; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_factura
    ADD CONSTRAINT fk_facturas FOREIGN KEY (facturas_id) REFERENCES public.facturas(id);


--
-- TOC entry 2909 (class 2606 OID 16461)
-- Name: detalle_factura fk_productos; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.detalle_factura
    ADD CONSTRAINT fk_productos FOREIGN KEY (productos_id) REFERENCES public.productos(id);


--
-- TOC entry 2907 (class 2606 OID 16466)
-- Name: clientes fk_tipo_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT fk_tipo_cliente FOREIGN KEY (tipo_cliente_id) REFERENCES public.tipo_cliente(id);


-- Completed on 2020-11-24 17:02:47

--
-- PostgreSQL database dump complete
--

