const fabricMaterials = ['Alpaca', 'Cork', 'Cotton', 'Dralon', 'Jute', 'Leather', 'Leather imitate', 'Linen', 'Lyocell', 'Merino wool', 'Metal', 'Modacrylic', 'Modal', 'Mohair', 'Natural Rubber', 'Nylon', 'Organic cotton', 'PVC', 'Paper fibre', 'Polyacrylic', 'Polyamide', 'Polycarbonate', 'Polyester', 'Polyethylene / Polypropylene', 'Polyurethane', 'Polyvinyl alcohol', 'Ramie', 'Recycled Cotton', 'Silk', 'Synthetics', 'Trevira CS', 'Viscose', 'Viscose (Bamboo)', 'Wool']

const fabricTypes = ['Alcantara', 'Baby corduroy', 'Batiste', 'Blackout Fabrics', 'Blackout fabric', 'Boiled wool', 'Bouclé', 'Brocade', 'Broderie anglaise', 'Canvas', 'Chambray', 'Charmeuse', 'Chenille', 'Chiffon', 'Coated cotton', 'Corduroy', 'Cotton', 'Crepe weave', 'Cretonne', 'Crushed velvet', 'Crêpe chiffon', 'Crêpe georgette', 'Cuff material', 'Damask', 'Denim', 'Double-ribbed fabric', 'Doubleface', 'Duchess', 'Facing', 'Faux fur', 'Faux suede', 'Felt', 'Fil-à-fil (end-on-end)', 'Fine corduroy', 'Fine knit', 'Fine ribbed fabric', 'Fishbone', 'Flannel', 'Flannelette', 'Fleece', 'Foil jersey', 'Gabardine', 'Georgette', 'Half-Panama', 'High-impact fabric', 'Imitation leather', 'Jacquard', 'Jersey', 'Jute Fabrics', 'Knitted fabric', 'Lace', 'Leather', 'Linen weave', 'Lining material', 'Microfibre', 'Modal', 'Molton', 'Muslin', 'Nap', 'Nicki velour', 'Organza', 'Ottoman', 'Painted fabric', 'Panama', 'Percale', 'Piqué', 'Plush fur', 'Ponte roma', 'Poplin', 'Pure linen', 'Raincoat Fabric', 'Ribbed fabric', 'Ribbed knit', 'Ripstop', 'Satin', 'Scuba', 'Seersucker', 'Semi-linen', 'Sequinned fabric', 'Sequinned jersey', 'Silk', 'Soft shell', 'Stretch terry', 'Sweatshirt material', 'Taffeta', 'Tapestry fabric', 'Tarpaulin', 'Tencel', 'Terrycloth', 'Tulle', 'Tulle lace', 'Tweed', 'Twill', 'Velour', 'Velvet', 'Viscose', 'Voile', 'Wadded fabric', 'Waffle piqué', 'Waxed fabric', 'Woollen cloth']

const fabricUses = ['Accessoires', 'Animal clothing', 'Aprons', 'Armchairs', 'Autumn/Winter', 'Awnings', 'Baby Decorations', 'Baby clothing', 'Bags', 'Bathrobe', 'Beachwear', 'Bed linen', 'Benches', 'Bikinis', 'Blankets', 'Blazers', 'Blouses', 'Bridal Wear', 'Business clothing', 'Capes', 'Cardigans', 'Carnival', 'Casual clothing', 'Children apparel', 'Children decor', 'Christmas', 'Clothing', 'Coats', 'Costumes', 'Couches', 'Crafts', 'Curtains', 'Curtains & Drapes', 'Decoration', 'Denim', 'Dolls clothing', 'Dresses', 'Easter', 'Evening and Party Wear', 'Evening wear', 'Gloves', 'Halloween', 'Hats', 'Headgear', 'Home accessories', 'Home clothing', 'Jackets', 'Jumpsuits', 'Knits', 'Knitted dresses', 'Knitted hats', 'Knitted jumpers', 'Knitted scarves', 'Knitted skirts', 'Leggings', 'Lining', 'Maternity clothing', 'Outdoor', 'Patchwork', 'Pyjamas', 'Scarves', 'Seat cushions', 'Seating', 'Shirts', 'Shorts', 'Skirts', 'Sleepwear', 'Sport or Functional', 'Spring or Summer', 'Stools', 'Sun shades', 'Sweatshirts', 'Swimsuits', 'Swimwear', 'T-Shirts', 'Table Decoration', 'Table runners', 'Tablecloths', 'Throws', 'Throws and Blankets', 'Tops', 'Towels', 'Traditonal clothing', 'Trousers', 'Tunics', 'Underwear', 'Upholstery', 'Waistcoats/Gilets', 'Wrap gifts']

const fabricCategories = ['Appliques', 'Buttons', 'Cords', 'DIY', 'Fabrics', 'Fat Quarters', 'Faux Leather', 'Haberdashery', 'Interlining', 'Leather', 'Ribbons', 'Sewing Patterns', 'Wool', 'Zippers']

const fabricColours = ['beige', 'black', 'blue', 'brown', 'gold', 'green', 'grey', 'multicolour', 'orange', 'pink', 'red', 'silver', 'turquoise', 'violet', 'white', 'yellow']

const fabricMOTIFs = ['Animalprint', 'Animals', 'Arrows', 'Batik', 'Cable Pattern', 'Cafe & Kitchen', 'Camouflage', 'Carnival', 'Cartoon designs', 'Checks', 'Chevron or Zigzag', 'Childrens designs', 'Christmas', 'Circles', 'Country house style', 'Crushed', 'Diamonds', 'Dots', 'Ethno', 'Feathers', 'Flowers', 'Fruits', 'Geometric pattern', 'Glitter', 'Hearts', 'Herringbone', 'Houndstooth', 'Ikat pattern', 'Letters & Numbers', 'Maritime designs', 'Melange', 'Miscellaneous designs', 'Moon', 'Mushrooms', 'Origami', 'Ornaments', 'Paisley', 'People', 'Plants', 'Retro', 'Sequins', 'Sports', 'Stars', 'Stripes', 'Unicolour', 'Unicorns', 'Vegetables', 'Vehicles', 'isiagu', 'PDP umbrella', 'APC broom','Nigeria Coat of Arms', 'Nigeria flag']

const fabricWidths = ['< 1.30 mtrs', '1.30 - 1.39 mtrs', '1.40 - 1.49 mtrs', '1.50 - 1.59 mtrs', '> 160 mtrs']

const fabricFeels = ['firm feel', 'hangs well', 'rough feel', 'sandy feel', 'smooth to the touch', 'snuggly soft', 'soft feel']

const fabricFeatures = ['2-way stretch', '4-way stretch', 'Horizontal Stretch', 'Vertical Stretch', 'breezy', 'double layer', 'easy-care', 'eudermic', 'festive', 'fine', 'firm', 'fleecy', 'heavy', 'heavy duty', 'light', 'robust', 'sheer', 'skintight', 'smooth', 'soft', 'stiff', 'stretchable', 'subtle', 'suited for knitting machines', 'tear-resistant', 'velvety']

const fabricSurfaces = ['bicolour', 'crushed', 'double sided', 'iridescent', 'matte', 'semi-transparent', 'shimmering', 'shiny', 'silk matte', 'slightly shiny', 'smooth', 'soft', 'sparkling', 'texturized', 'translucent', 'transparent']

const fabricManufacturings = ['Felted', 'Shank button', 'fulled', 'knitted', 'warp knitted', 'woven']

const fabricFinishings = ['UV-light resistant', 'absorbant', 'antibacterial treatment', 'antistatic', 'breathable', 'colour-fast', 'easy-care', 'flame-retardant', 'mould resistant', 'stable in shape', 'stain-resistant', 'water-repellent', 'waterproof']

const fabricTextileFinishings = ['Digitally printed', 'Dyed', 'PUR-coated', 'PVC-coated', 'backed', 'coated', 'crushed', 'embossed', 'embroidered', 'flocked', 'non-backed', 'pleated', 'printed', 'printed with foil', 'raised', 'surface colored', 'teflon-coated']

const fabricWeights = ['0 - 100 g', '100 - 200 g', '200 - 300 g', '300 - 400 g', '400 - 500 g', '500 - 600 g', '600 - 700 g', '700 - 800 g', '800 - 900 g', '1200 - 1300 g']

export {
    fabricCategories,
    fabricColours,
    fabricFeatures,
    fabricFeels,
    fabricFinishings,
    fabricMOTIFs,
    fabricManufacturings,
    fabricMaterials,
    fabricSurfaces,
    fabricTextileFinishings,
    fabricTypes,
    fabricUses,
    fabricWeights,
    fabricWidths
};