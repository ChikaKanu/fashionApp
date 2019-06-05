import React from 'react';
import Style from './Style';

const StyleList = (props) => {

    const style = props.styles.map((style) => {
        return(
            <li key={style.id} className="style-component-list-item">
                <div className="style-component">
                    <Style style={style}/>
                </div>
            </li>
        )
    })

    return(
        <ul>
            {style}
        </ul>
    )
}

export default StyleList;